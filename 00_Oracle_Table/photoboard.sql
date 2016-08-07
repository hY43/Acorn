create table photoboard
(pno	number(5),
title varchar2(100),
contents varchar2(100),
writer varchar2(100),
filename varchar2(1000),
regdate	date);

create sequence photoboard_pno_seq
start with 1
increment by 1
nocache
nocycle;

alter table photoboard
add constraint photoboard_pno_pk primary key(pno);