package cn.edu.ustc.clientcard.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TrnMid entity. @author MyEclipse Persistence Tools
 */

public class TrnMid implements java.io.Serializable {

	// Fields

	private Long midid;
	private String busstatus;
	private Boolean midflg;
	private String owcopid;
	private String owuserid;
	private Boolean sharekub;
	private Boolean owbusflg;
	private Long cotptcnt;
	private Long viwptcnt;
	private Boolean outputflg;
	private Short ippaternkub;
	private Short ipregoder;
	private Boolean ipnewflg;
	private Timestamp regtim;
	private Boolean delflg;
	private Timestamp crttim;
	private String crtusr;
	private Timestamp updtim;
	private String updusr;
	private String midfront;
	private String midback;
	private Set trnGroupNcs = new HashSet(0);
	private Set trnNcs = new HashSet(0);
	private Set trnAccesses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TrnMid() {
	}

	/** full constructor */
	public TrnMid(String busstatus, Boolean midflg, String owcopid,
			String owuserid, Boolean sharekub, Boolean owbusflg, Long cotptcnt,
			Long viwptcnt, Boolean outputflg, Short ippaternkub,
			Short ipregoder, Boolean ipnewflg, Timestamp regtim,
			Boolean delflg, Timestamp crttim, String crtusr, Timestamp updtim,
			String updusr, String midfront, String midback, Set trnGroupNcs,
			Set trnNcs, Set trnAccesses) {
		this.busstatus = busstatus;
		this.midflg = midflg;
		this.owcopid = owcopid;
		this.owuserid = owuserid;
		this.sharekub = sharekub;
		this.owbusflg = owbusflg;
		this.cotptcnt = cotptcnt;
		this.viwptcnt = viwptcnt;
		this.outputflg = outputflg;
		this.ippaternkub = ippaternkub;
		this.ipregoder = ipregoder;
		this.ipnewflg = ipnewflg;
		this.regtim = regtim;
		this.delflg = delflg;
		this.crttim = crttim;
		this.crtusr = crtusr;
		this.updtim = updtim;
		this.updusr = updusr;
		this.midfront = midfront;
		this.midback = midback;
		this.trnGroupNcs = trnGroupNcs;
		this.trnNcs = trnNcs;
		this.trnAccesses = trnAccesses;
	}

	// Property accessors

	public Long getMidid() {
		return this.midid;
	}

	public void setMidid(Long midid) {
		this.midid = midid;
	}

	public String getBusstatus() {
		return this.busstatus;
	}

	public void setBusstatus(String busstatus) {
		this.busstatus = busstatus;
	}

	public Boolean getMidflg() {
		return this.midflg;
	}

	public void setMidflg(Boolean midflg) {
		this.midflg = midflg;
	}

	public String getOwcopid() {
		return this.owcopid;
	}

	public void setOwcopid(String owcopid) {
		this.owcopid = owcopid;
	}

	public String getOwuserid() {
		return this.owuserid;
	}

	public void setOwuserid(String owuserid) {
		this.owuserid = owuserid;
	}

	public Boolean getSharekub() {
		return this.sharekub;
	}

	public void setSharekub(Boolean sharekub) {
		this.sharekub = sharekub;
	}

	public Boolean getOwbusflg() {
		return this.owbusflg;
	}

	public void setOwbusflg(Boolean owbusflg) {
		this.owbusflg = owbusflg;
	}

	public Long getCotptcnt() {
		return this.cotptcnt;
	}

	public void setCotptcnt(Long cotptcnt) {
		this.cotptcnt = cotptcnt;
	}

	public Long getViwptcnt() {
		return this.viwptcnt;
	}

	public void setViwptcnt(Long viwptcnt) {
		this.viwptcnt = viwptcnt;
	}

	public Boolean getOutputflg() {
		return this.outputflg;
	}

	public void setOutputflg(Boolean outputflg) {
		this.outputflg = outputflg;
	}

	public Short getIppaternkub() {
		return this.ippaternkub;
	}

	public void setIppaternkub(Short ippaternkub) {
		this.ippaternkub = ippaternkub;
	}

	public Short getIpregoder() {
		return this.ipregoder;
	}

	public void setIpregoder(Short ipregoder) {
		this.ipregoder = ipregoder;
	}

	public Boolean getIpnewflg() {
		return this.ipnewflg;
	}

	public void setIpnewflg(Boolean ipnewflg) {
		this.ipnewflg = ipnewflg;
	}

	public Timestamp getRegtim() {
		return this.regtim;
	}

	public void setRegtim(Timestamp regtim) {
		this.regtim = regtim;
	}

	public Boolean getDelflg() {
		return this.delflg;
	}

	public void setDelflg(Boolean delflg) {
		this.delflg = delflg;
	}

	public Timestamp getCrttim() {
		return this.crttim;
	}

	public void setCrttim(Timestamp crttim) {
		this.crttim = crttim;
	}

	public String getCrtusr() {
		return this.crtusr;
	}

	public void setCrtusr(String crtusr) {
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

	public String getMidfront() {
		return this.midfront;
	}

	public void setMidfront(String midfront) {
		this.midfront = midfront;
	}

	public String getMidback() {
		return this.midback;
	}

	public void setMidback(String midback) {
		this.midback = midback;
	}

	public Set getTrnGroupNcs() {
		return this.trnGroupNcs;
	}

	public void setTrnGroupNcs(Set trnGroupNcs) {
		this.trnGroupNcs = trnGroupNcs;
	}

	public Set getTrnNcs() {
		return this.trnNcs;
	}

	public void setTrnNcs(Set trnNcs) {
		this.trnNcs = trnNcs;
	}

	public Set getTrnAccesses() {
		return this.trnAccesses;
	}

	public void setTrnAccesses(Set trnAccesses) {
		this.trnAccesses = trnAccesses;
	}

}