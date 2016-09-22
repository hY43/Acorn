'''
Created on 2016. 9. 22.
set: 순서가 없으며 중복이 없다.
@author: kitcoop
'''

a = {1,2,3};
print("a: ", a);

# 중복된 값을 허용하지 않기 때문에, 중복된 값을 제외하고 1개만 남긴다.
a = {1,1,1,2,2,2,3,3,3,4,4};
print("a: ", a);

# print("a[0]: ", a[0]); #'set' object does not support indexing

b = {3,4};
print("b: ", b);
a = {1,2,3};

# a와 b의 집합 연산 가능
# 교집합, 차집합, 합집합

print("a.union(b): ", a.union(b)); # 합집합
print("a|b: ", a|b); # 합집합(OR)

print("a.intersection(b): ", a.intersection(b)) # 교집합
print("a&b: ", a&b); # 교집합(AND)

print("a-b: ", a-b); # 차집합

print("====================================================");
print("b: ", b);
b.add(5);
print("b: ", b);

# update 함수로는 tuple, set, list의 형태로도 추가가 가능하다.
b.update((6,7)); # tuple
print("b: ", b);

b.update({8,9}); # set
print("b: ", b);

b.update([10,11]); # list
print("b: ", b);

# discard(): 존재하면 삭제, 없으면 무시
b.discard(7);
print("b: ", b);

# remove(): 반드시 삭제, 없으면 에러
b.discard(8);
print("b: ", b);

'''
print("====================================================");
# Question, list = [1,22,22,4,99,11,33,55]

# 1. 중복
list = [1,22,22,4,99,11,33,55]
setTest = set(list);
print(setTest);
listT = list(setTest);
print(listT);

# 2. 정렬
listT.sort();
print(listT);
'''
 
print("====================================================");
aa = (1);  # tuple로 쓰려하지만 값이 한개만 존재하기 때문에 그냥 int type의 변수로 취급한다.
bb = (1,);
print("aa: ", aa, type(aa));
print("bb: ", bb, type(bb));
 
 
