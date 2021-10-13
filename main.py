tuple=(1,2,"abhi",4)
print(tuple)

print(tuple.count(0))
a={1,2,3,4}
print(a)
a.add("pvn")
print(a)
dict={"name1":"abhi","name2":"pavan",2:3}
print(dict)
print(len(dict))
print(dict[2])
tuple=(1,2,3)
print(tuple)
b=list(tuple)
print(b)
def fun():
    a=20
    b=3
    c=a+b
    return c
print(fun())

string="abhi"
def fun(*name):
    print("the paased arguments are:")
    for i in name:
        print(i)
fun(1,)
def fun(name,message):
    print("name is:",name,"message is:",message)
fun("abhi","how are u")
def fun(a,b):
    print(a,b)
fun(a=2,b=3)
def fruit(**names):
    print(names)
fruit(b="banana")
fruit(d="dusk",m="mango")
string="abhi"
for i in string[2]:
    print(i)
list1=[1,2,3]
iter_list=iter(list1)
print(iter_list)
print(next(iter_list))
print(next(iter_list))
set=(1,2,3)
print(set[1])
a=lambda x: x + 10
print(a)
print("addition",30)
def fun(a,b):
    print(a,b)
fun(a,b)
def fun(a,b):
   for i in a:
       print(i)
fun((1,2,3),3)
def fun1(n):
    return lambda i:i*n
print(fun1(2))
def fun():
    a=10
    b=20
    c=a+b
    return c
print(fun())





print(fun())








