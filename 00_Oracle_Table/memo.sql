drop table memo;
drop sequence number_no_seq;

create table memo
(
no number(10),
writer varchar2(20),
contents varchar2(3000),
wdate date,
status number(3),
pw varchar2(20)
);

create sequence number_no_seq
start with 1
increment by 1
nocache
nocycle;

alter table memo
add constraint memo_no_pk primary key(no);

commit;