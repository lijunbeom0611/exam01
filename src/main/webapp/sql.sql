create table tbl_rental(
	rental_no varchar2(10) not null primary key,
	student_no char(6),
	rental_date char(8),
	uniform_size varchar2(5)
);

insert into tbl_rental values('R20230001', 'S1001', '20230901', 'M');
insert into tbl_rental values('R20230002', 'S1002', '20230901', 'L');
insert into tbl_rental values('R20230003', 'S1003', '20230902', 'XL');
insert into tbl_rental values('R20230004', 'S1004', '20230903', 'M');
insert into tbl_rental values('R20230005', 'S1005', '20230904', 'L');

drop table tbl_rental;
select * from tbl_rental;

SELECT * FROM tbl_rental WHERE rental_no = 'R20230001';