package com.kapple.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kapple.domain.ComponentVO;
import com.kapple.domain.ProposalVO;
import com.kapple.domain.SupplierDetailVO;
import com.kapple.domain.SupplierVO;

public interface MapperKW {

	public Date test();
	public List<SupplierVO> supplierList(String compo_name);
	public SupplierDetailVO supplierDetail(String suppl_no);
	public int supplierCnt(String compo_name);
	public ProposalVO getProposal(@Param("compo_name") String compo_name, @Param("suppl_no")String suppl_no);
	public ComponentVO componentDetail(String compo_name);
}
