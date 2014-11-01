package cn.edu.ustc.clientcard.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * MstUser entity. @author MyEclipse Persistence Tools
 */

public class MstUser implements java.io.Serializable {

	// Fields

	private Long userid;
	private String usernam;
	private String password;
	private String uim;
	private String mailads;
	private Long defaultkey;
	private Integer logerrcnt;
	private Timestamp logintim;
	private String userkub;
	private String dwnlodauth;
	private Boolean userdecide;
	private Timestamp expirtndate;
	private Boolean delflg;
	private Timestamp crttim;
	private String crtusr;
	private Timestamp updtim;
	private String updusr;
	private Set trnGroups = new HashSet(0);
	private Set trnAccesses = new HashSet(0);
	private Set mstUnitUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public MstUser() {
	}

	/** minimal constructor */
	public MstUser(String usernam, String password, String userkub) {
		this.usernam = usernam;
		this.password = password;
		this.userkub = userkub;
	}

	/** full constructor */
	public MstUser(String usernam, String password, String uim, String mailads,
			Long defaultkey, Integer logerrcnt, Timestamp logintim,
			String userkub, String dwnlodauth, Boolean userdecide,
			Timestamp expirtndate, Boolean delflg, Timestamp crttim,
			String crtusr, Timestamp updtim, String updusr, Set trnGroups,
			Set trnAccesses, Set mstUnitUsers) {
		this.usernam = usernam;
		this.password = password;
		this.uim = uim;
		this.mailads = mailads;
		this.defaultkey = defaultkey;
		this.logerrcnt = logerrcnt;
		this.logintim = logintim;
		this.userkub = userkub;
		this.dwnlodauth = dwnlodauth;
		this.userdecide = userdecide;
		this.expirtndate = expirtndate;
		this.delflg = delflg;
		this.crttim = crttim;
		this.crtusr = crtusr;
		this.updtim = updtim;
		this.updusr = updusr;
		this.trnGroups = trnGroups;
		this.trnAccesses = trnAccesses;
		this.mstUnitUsers = mstUnitUsers;
	}

	// Property accessors

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsernam() {
		return this.usernam;
	}

	public void setUsernam(String usernam) {
		this.usernam = usernam;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUim() {
		return this.uim;
	}

	public void setUim(String uim) {
		this.uim = uim;
	}

	public String getMailads() {
		return this.mailads;
	}

	public void setMailads(String mailads) {
		this.mailads = mailads;
	}

	public Long getDefaultkey() {
		return this.defaultkey;
	}

	public void setDefaultkey(Long defaultkey) {
		this.defaultkey = defaultkey;
	}

	public Integer getLogerrcnt() {
		return this.logerrcnt;
	}

	public void setLogerrcnt(Integer logerrcnt) {
		this.logerrcnt = logerrcnt;
	}

	public Timestamp getLogintim() {
		return this.logintim;
	}

	public void setLogintim(Timestamp logintim) {
		this.logintim = logintim;
	}

	public String getUserkub() {
		return this.userkub;
	}

	public void setUserkub(String userkub) {
		this.userkub = userkub;
	}

	public String getDwnlodauth() {
		return this.dwnlodauth;
	}

	public void setDwnlodauth(String dwnlodauth) {
		this.dwnlodauth = dwnlodauth;
	}

	public Boolean getUserdecide() {
		return this.userdecide;
	}

	public void setUserdecide(Boolean userdecide) {
		this.userdecide = userdecide;
	}

	public Timestamp getExpirtndate() {
		return this.expirtndate;
	}

	public void setExpirtndate(Timestamp expirtndate) {
		this.expirtndate = expirtndate;
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

	public Set getTrnGroups() {
		return this.trnGroups;
	}

	public void setTrnGroups(Set trnGroups) {
		this.trnGroups = trnGroups;
	}

	public Set getTrnAccesses() {
		return this.trnAccesses;
	}

	public void setTrnAccesses(Set trnAccesses) {
		this.trnAccesses = trnAccesses;
	}

	public Set getMstUnitUsers() {
		return this.mstUnitUsers;
	}

	public void setMstUnitUsers(Set mstUnitUsers) {
		this.mstUnitUsers = mstUnitUsers;
	}

}