/**
 * 
 */
package es.upm.dit.gsi.trainmining.engine;

import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatelessKnowledgeSession;

import es.upm.dit.gsi.trainmining.model.Alarm;
import es.upm.dit.gsi.trainmining.model.Prediction;

import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;

/**
 * @author 
 * 
 */
public class Engine implements EngineInterface {

	// Singleton code
	//
	// private Engine instance;
	//
	// private Engine () {
	//
	// }
	//
	// public Engine getInstance() {
	// if (instance == null) {
	// this.instance = new Engine();
	// }
	// return this.instance;
	// }

	public Engine() {

	}

	public Prediction predict(String RuleBasePath,
			List<Alarm> alarms) {
        try {
            // load up the knowledge base
            KnowledgeBase kbase = readKnowledgeBase();
            StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();
            KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
            // go !
            ksession.execute(alarms);
            logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
		return null;
	}
	
	private static KnowledgeBase readKnowledgeBase() throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("Sample.drl"), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }

}
