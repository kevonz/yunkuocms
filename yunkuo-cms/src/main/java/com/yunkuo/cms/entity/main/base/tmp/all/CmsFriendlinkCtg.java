package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_friendlink_ctg database table.
 * 
 */
@Entity
@Table(name="cms_friendlink_ctg")
public class CmsFriendlinkCtg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="friendlinkctg_id")
	private int friendlinkctgId;

	@Column(name="friendlinkctg_name")
	private String friendlinkctgName;

	private int priority;

	//bi-directional many-to-one association to CmsFriendlink
	@OneToMany(mappedBy="cmsFriendlinkCtg")
	private List<CmsFriendlink> cmsFriendlinks;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	public CmsFriendlinkCtg() {
	}

	public int getFriendlinkctgId() {
		return this.friendlinkctgId;
	}

	public void setFriendlinkctgId(int friendlinkctgId) {
		this.friendlinkctgId = friendlinkctgId;
	}

	public String getFriendlinkctgName() {
		return this.friendlinkctgName;
	}

	public void setFriendlinkctgName(String friendlinkctgName) {
		this.friendlinkctgName = friendlinkctgName;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public List<CmsFriendlink> getCmsFriendlinks() {
		return this.cmsFriendlinks;
	}

	public void setCmsFriendlinks(List<CmsFriendlink> cmsFriendlinks) {
		this.cmsFriendlinks = cmsFriendlinks;
	}

	public CmsFriendlink addCmsFriendlink(CmsFriendlink cmsFriendlink) {
		getCmsFriendlinks().add(cmsFriendlink);
		cmsFriendlink.setCmsFriendlinkCtg(this);

		return cmsFriendlink;
	}

	public CmsFriendlink removeCmsFriendlink(CmsFriendlink cmsFriendlink) {
		getCmsFriendlinks().remove(cmsFriendlink);
		cmsFriendlink.setCmsFriendlinkCtg(null);

		return cmsFriendlink;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

}