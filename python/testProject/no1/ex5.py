'''
Created on 2016. 9. 21.
tuple: list와 유사하다. 수정 불가. list보다 속도가 빠르다.
@author: kitcoop
'''
t = 'a', 'b', 'c';
print(" t: ", t);

# 가독성을 위해 () 방식으로 사용
t = ('a', 'b', 'c');
print(" t: ", t);

print("깅이: ", len(t), "b는 몇번째 위치", t.index('b'));

p = (1,2,3);
print(p);
print("======================================");
# p[0] = 100;
# tuple은 수정이 불가능하기 때문에 list로 변경하여 수정해야한다.
q = list(p);
print("q: ", q);
q[0] = 100;
print("q: ", q);
p = tuple(q);
print("p: ", p);

# 튜플안에서의 값 위치를 변경
t1 = (10,20); # packing
print(t1);
a, b = t1; # unpacking
print("a: ",a ," b: ", b);
a, b = b, a;
t1 = (a, b);
print(t1);
 
# 내림차순 정렬
t3 = (100, 20, 40, 30);
print(t3);
sortT3 = list(t3);
sortT3.sort();
t3 = tuple(sortT3);
print(t3);
