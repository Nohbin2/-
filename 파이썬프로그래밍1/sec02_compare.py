from math import sqrt

m = 2
n = 4

if m * m == n :
    print("2 times 2 is four.")
    
x = sqrt(2)
y = 2.0
 
if x * x == y :
    print("sqrt(2) times sqrt(2) is 2")
else : 
    print("sqrt(2) times sqrt(2) is not two but %.18f" % (x * x))
    
EPSILON = 1E-14
if abs(x * x - y) < EPSILON :
    print("sqrt(2) times sqrt(2) is approximately 2")
    
s = "120"
t = "20"

if s == t :
    comparsion = "is the same as"
else : 
    comparison = "is not the same as"

print(" The string '%s' %s the string '%s'. " %(s, comparison, t))

u = "1" + t
if s != u :
    comparison = "not "
else :
    comparison =""
    
print(" The string '%s' and '%s' are %sidentical." % (s, u, comparison))
 
    
