from __init__ import *

parseFile('parserinput/albacete_nextday.txt','parseroutput/albacete1d.drl','RtoDrools/albacete')
parseFile('parserinput/albacete_nextweek.txt','parseroutput/albacete7d.drl','RtoDrools/albacete')
parseFile('parserinput/albacete_twodays.txt','parseroutput/albacete2d.drl','RtoDrools/albacete')

parseFile('parserinput/antequera_nextday.txt','parseroutput/antequera1d.drl','RtoDrools/antequera')

parseFile('parserinput/segovia_nextday.txt','parseroutput/segovia1d.drl','RtoDrools/segovia')
parseFile('parserinput/segovia_twodays.txt','parseroutput/segovia2d.drl','RtoDrools/segovia')
parseFile('parserinput/segovia_nextweek.txt','parseroutput/segovia7d.drl','RtoDrools/segovia')
