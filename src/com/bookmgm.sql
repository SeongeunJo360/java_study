use hrdb2019;
select database();

-- 테이블 3개 생성, book_tj, book_yes24, book_aladin
-- bid : pk('B001', 트리거생성), title, autor, price, isbn(랜덤 정수 4 자리 생성), bdate
show tables;
create table book_tj(
	bid		char(5)		primary key, 
    title	varchar(50)	not null,
    autor	varchar(10),
    price	int,
    isbn	int,
    bdate   datetime
);
create table book_yes24(
	bid		char(5)		primary key, 
    title	varchar(50)	not null,
    autor	varchar(10),
    price	int,
    isbn	int,
    bdate   datetime
);
create table book_yes24(
	bid		char(5)		primary key, 
    title	varchar(50)	not null,
    autor	varchar(10),
    price	int,
    isbn	int,
    bdate   datetime
);
select * from infromation_schema.triggers;
/*************************************************/
delimiter $$
create trigger trg_book_aladin_bid
before insert on book_aladin -- 테이블명 
for each row
begin
declare max_code int;

-- 현재 저장된 값 중 가장 큰 값을 가져옴
select ifnull(max(cast(right(bid,3) as unsignes)), 0)
into max_code;







/*************************************************/

-- Connection 확인
show status like 'threads_connected'; -- 접속 커넥션 수
show processlist;
show variables like 'max_connections'; -- 최대 접속 가능 커넥션 수





















