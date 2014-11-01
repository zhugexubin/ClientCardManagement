package cn.edu.ustc.clientcard.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TrnGroup entity. @author MyEclipse Persistence Tools
 */

public class TrnGroup implements java.io.Serializable {

	// Fields

	private Long groupid;
	private TrnGroup trnGroup;
	private MstUser mstUser;
	private String groupnam;
	private String groupnote;
	private String copid;
	private Boolean shareflg;
	private Integer orderdis;
	private Timestamp crttim;
	private Long crtusr;
	private Timestamp updtim;
	private String updusr;
	private Set trnGroupNcs = new HashSet(0);
	private Set trnGroups = new HashSet(0);

	// Constructors

	/** default constructor */
	public TrnGroup() {
	}

	/** minimal constructor */
	public TrnGroup(MstUser mstUser, String groupnam) {
		this.mstUser = mstUser;
		this.groupnam = groupnam;
	}

	/** full constructor */
	public TrnGroup(TrnGroup trnGroup, MstUser mstUser, String groupnam,
			String groupnote, String copid, Boolean shareflg, Integer orderdis,
			Timestamp crttim, Long crtusr, Timestamp updtim, String updusr,
			Set trnGroupNcs, Set trnGroups) {
		this.trnGroup = trnGroup;
		this.mstUser = mstUser;
		this.groupnam = groupnam;
		this.groupnote = groupnote;
		this.copid = copid;
		this.shareflg = shareflg;
		this.orderdis = orderdis;
		this.crttim = crttim;
		this.crtusr = crtusr;
		this.updtim = updtim;
		this.updusr = updusr;
		this.trnGroupNcs = trnGroupNcs;
		this.trnGroups = trnGroups;
	}

	// Property accessors

	public Long getGroupid() {
		return this.groupid;
	}

	public void setGroupid(Long groupid) {
		this.groupid = groupid;
	}

	public TrnGroup getTrnGroup() {
		return this.trnGroup;
	}

	public void setTrnGroup(TrnGroup trnGroup) {
		this.trnGroup = trnGroup;
	}

	public MstUser getMstUser() {
		return this.mstUser;
	}

	public void setMstUser(MstUser mstUser) {
		this.mstUser = mstUser;
	}

	public String getGroupnam() {
		return this.groupnam;
	}

	public void setGroupnam(String groupnam) {
		this.groupnam = groupnam;
	}

	public String getGroupnote() {
		return this.groupnote;
	}

	public void setGroupnote(String groupnote) {
		this.groupnote = groupnote;
	}

	public String getCopid() {
		return this.copid;
	}

	public void setCopid(String copid) {
		this.copid = copid;
	}

	public Boolean getShareflg() {
		return this.shareflg;
	}

	public void setShareflg(Boolean shareflg) {
		this.shareflg = shareflg;
	}

	public Integer getOrderdis() {
		return this.orderdis;
	}

	public void setOrderdis(Integer orderdis) {
		this.orderdis = orderdis;
	}

	public Timestamp getCrttim() {
		return this.crttim;
	}

	public void setCrttim(Timestamp crttim) {
		this.crttim = crttim;
	}

	public Long getCrtusr() {
		return this.crtusr;
	}

	public void setCrtusr(Long crtusr) {
		this.crtusr = crtusr;
	}

	public Timestamp getUpdtim() {
		return this.updtim;
	}

	public void setUpdtim(Timestamp updtim) {
		this.updtim = updtim;
	}

	public String getUpdusr() {
		return this.updusr;
	}

	public void setUpdusr(String updusr) {
		this.updusr = updusr;
	}

	public Set getTrnGroupNcs() {
		return this.trnGroupNcs;
	}

	public void setTrnGroupNcs(Set trnGroupNcs) {
		this.trnGroupNcs = trnGroupNcs;
	}

	public Set getTrnGroups() {
		return this.trnGroups;
	}

	public void setTrnGroups(Set trnGroups) {
		this.trnGroups = trnGroups;
	}

}