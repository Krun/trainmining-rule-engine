/**
 * 
 */
package es.upm.dit.gsi.trainmining.engine;

import java.util.ArrayList;
import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatelessKnowledgeSession;

import es.upm.dit.gsi.trainmining.model.Alarm;
import es.upm.dit.gsi.trainmining.model.PossibleEvent;
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
			List<Alarm> alarms) throws Exception {
            // load up the knowledge base
        KnowledgeBase kbase = readKnowledgeBase(RuleBasePath);
        StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();
        KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
        ArrayList<PossibleEvent> resultList = new ArrayList<PossibleEvent>();
        ksession.setGlobal("resultList",resultList);
        // go !
        ksession.execute(alarms);
        logger.close();
        Prediction predict = new Prediction();
        predict.setPrediction(resultList);
        predict.setCurrentEventsList(alarms);
        return predict;
	}
	
	private static KnowledgeBase readKnowledgeBase(String RuleBasePath) throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource(RuleBasePath), ResourceType.DRL);
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
