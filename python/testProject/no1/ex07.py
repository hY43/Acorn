'''

dict 사전형 {키:값}: map 계열로 자바에서는 JSON이라고 부른다.
순서가 없으며, 키는 중복할 수 없고, 값은 중복이 가능하다.

'''
myDic = dict(k1=1, k2='abc', k3=3.4);
print("myDic: ", myDic);

dic = {"파이썬":"비단뱀", 
       "자바":"커피",
       "스프링":"봄"};

print("dic", dic);
print("len(dic)", len(dic));
print("dic['자바']: ", dic['자바']);

dic['오라클'] = "예언자";
print("dic: ", dic);

del dic['오라클'];
print("dic: ", dic);