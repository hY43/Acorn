CREATE TABLE guestbook
(
gno	number(10),
writer	varchar2(2000),
contents	varchar2(2000),
regdate	date
);

CREATE SEQUENCE guestbook_gno_seq
start with 1
increment by 1
nocache
nocycle;

insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello1', sysdate);
insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello2', sysdate);
insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello3', sysdate);
insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello4', sysdate);
insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello5', sysdate);
insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello6', sysdate);
insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello7', sysdate);
insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello8', sysdate);
insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello9', sysdate);
insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello10', sysdate);
insert into guestbook
values(guestbook_gno_seq.nextval, 'sangwon', 'hello11', sysdate);

ALTER TABLE guestbook
ADD CONSTRAINT guestbook_gno_pk primary key(gno);

commit;
