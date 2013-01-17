import fileinput

def parseFile(inputfile,outputfile):
  for line in fileinput.input(inputfile):
    parseLine(line)

def parseLine(line):
    line = line.split('},{')
    LHS = line[0].split(',');
    RHS = line[1].split(',');

    confidence = RHS[1]
    antecedents = LHS[1:]
    antecedents[0] = antecedents[0].replace('"<{','')
    consequent = RHS[0]
    consequent = consequent.replace('}>"','')
    return [antecedents, consequent]
    

