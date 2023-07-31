package com.kapple.domain;

import org.springframework.context.annotation.ComponentScan;

import lombok.AllArgsConstructor;
import lombok.Data;


//@Data ������̼��� Lombok ���̺귯������ �����ϴ� �������,
//@Getter, @Setter, @ToString, @EqualsAndHashCode, �׸���
//@RequiredArgsConstructor ������̼ǵ��� �� ���� �����ϴ� ������̼�
@Data
@ComponentScan
//@AllArgsConstructor
public class TestTblVO {
	
	private String test_no;
	private String contents;
	private long anynum;
}
