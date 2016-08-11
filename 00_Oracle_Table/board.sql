create table board
(
	no	number(10),
	title	varchar2(20),
	writer	varchar2(20),
	contents	varchar2(1000),
	hits	number(10),
	wdate	date,
	status	number(10)
);

create sequence board_bno_seq
start with 1
increment by 1
nocache
nocycle;

insert into board
values( board_bno_seq.nextval, '푸하하', 'sangwon', '안뇽안뇽', 0, sysdate, 1);
insert into board
values( board_bno_seq.nextval, '게시글2', 'sangwon', '안뇽안뇽2', 0, sysdate, 1);
insert into board
values( board_bno_seq.nextval, '게시글3', 'sangwon', '안뇽안뇽3', 0, sysdate, 1);
insert into board
values( board_bno_seq.nextval, '게시글4', 'sangwon', '안뇽안뇽4', 0, sysdate, 1);
insert into board
values( board_bno_seq.nextval, '게시글5', 'sangwon', '안뇽안뇽5', 0, sysdate, 1);
insert into board
values( board_bno_seq.nextval, '게시글6', 'sangwon', '안뇽안뇽6', 0, sysdate, 1);
insert into board
values( board_bno_seq.nextval, '게시글7', 'sangwon', '안뇽안뇽7', 0, sysdate, 1);
insert into board
values( board_bno_seq.nextval, '게시글8', 'sangwon', '안뇽안뇽8', 0, sysdate, 1);
insert into board
values( board_bno_seq.nextval, '게시글9', 'sangwon', '안뇽안뇽9', 0, sysdate, 1);


alter table board
add constraint board_bno_pk	primary key(bno);

commit;


