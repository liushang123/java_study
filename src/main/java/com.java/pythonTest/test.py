#coding:utf-8
import sys
import numpy as np
#print "script name:", sys.argv[0]
for i in range(1, len(sys.argv)):
    if(i==1):
        path = sys.argv[i]
    elif(i==2):
        latitude=sys.argv[i]
    elif(i==3):
        longitude=sys.argv[i]
    #print "Parameter:", i, sys.argv[i]
#print "longitude=",longitude," ---",type(longitude)
#print "latitude=",latitude
c=int(longitude)+int(latitude)
#print c
a=np.load(path)
print a[:,int(longitude),int(latitude)]
def myfunction(a,b,c):
	for i in range(len(a)):
		print "%d" %(a[i][b][c])
#myfunction(a,int(longitude),int(latitude))