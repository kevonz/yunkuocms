package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsVoteItem;
import com.yunkuo.cms.entity.main.CmsSite;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the cms_vote_topic database table.
 * 
 */
/*@Entity
@Table(name="cms_vote_topic")*/
@MappedSuperclass
public class BaseCmsVoteTopic implements Serializable {
	private static final long serialVersionUID = 1L;
    public static String PROP_END_TIME = "endTime";
    public static String PROP_START_TIME = "startTime";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="votetopic_id")
	private Integer id;

	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="is_def")
	private Boolean def;

	@Column(name="is_disabled")
	private Boolean disabled;

	@Column(name="is_restrict_cookie")
	private Boolean restrictCookie;

	@Column(name="is_restrict_ip")
	private Boolean restrictIp;

	@Column(name="is_restrict_member")
	private Boolean restrictMember;

	@Column(name="multi_select")
	private Integer multiSelect;

	@Column(name="repeate_hour")
	private Integer repeateHour;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	private String title;

	@Column(name="total_count")
	private Integer totalCount;

	//bi-directional many-to-one association to CmsVoteItem
    //TODO relation
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)//, mappedBy="cmsVoteTopic")
    @JoinColumn(name="votetopic_id")
   /* @JoinTable(name = "cms_vote_item"
            , joinColumns = {
            @JoinColumn(name = "votetopic_id")
    },inverseJoinColumns=@JoinColumn(name="votetopic_id"))*/
	private Set<CmsVoteItem> items;

/*	//bi-directional many-to-one association to CmsVoteRecord
	@OneToMany(mappedBy="cmsVoteTopic")
	private List<CmsVoteRecord> cmsVoteRecords;*/

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

    // constructors
    public BaseCmsVoteTopic () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsVoteTopic (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsVoteTopic (
            java.lang.Integer id,
            com.yunkuo.cms.entity.main.CmsSite site,
            java.lang.String title,
            java.lang.Integer totalCount,
            java.lang.Integer multiSelect,
            java.lang.Boolean restrictMember,
            java.lang.Boolean restrictIp,
            java.lang.Boolean restrictCookie,
            java.lang.Boolean disabled,
            java.lang.Boolean def) {

        this.setId(id);
        this.setSite(site);
        this.setTitle(title);
        this.setTotalCount(totalCount);
        this.setMultiSelect(multiSelect);
        this.setRestrictMember(restrictMember);
        this.setRestrictIp(restrictIp);
        this.setRestrictCookie(restrictCookie);
        this.setDisabled(disabled);
        this.setDef(def);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer votetopicId) {
		this.id = votetopicId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Boolean getDef() {
		return this.def;
	}

	public void setDef(Boolean isDef) {
		this.def = isDef;
	}

	public Boolean getDisabled() {
		return this.disabled;
	}

	public void setDisabled(Boolean isDisabled) {
		this.disabled = isDisabled;
	}

	public Boolean getRestrictCookie() {
		return this.restrictCookie;
	}

	public void setRestrictCookie(Boolean isRestrictCookie) {
		this.restrictCookie = isRestrictCookie;
	}

	public Boolean getRestrictIp() {
		return this.restrictIp;
	}

	public void setRestrictIp(Boolean isRestrictIp) {
		this.restrictIp = isRestrictIp;
	}

	public Boolean getRestrictMember() {
		return this.restrictMember;
	}

	public void setRestrictMember(Boolean isRestrictMember) {
		this.restrictMember = isRestrictMember;
	}

	public Integer getMultiSelect() {
		return this.multiSelect;
	}

	public void setMultiSelect(Integer multiSelect) {
		this.multiSelect = multiSelect;
	}

	public Integer getRepeateHour() {
		return this.repeateHour;
	}

	public void setRepeateHour(Integer repeateHour) {
		this.repeateHour = repeateHour;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Set<CmsVoteItem> getItems() {
		return this.items;
	}

	public void setItems(Set<CmsVoteItem> cmsVoteItems) {
		this.items = cmsVoteItems;
	}

	/*public CmsVoteItem addCmsVoteItem(CmsVoteItem cmsVoteItem) {
		getCmsVoteItems().add(cmsVoteItem);
		cmsVoteItem.setCmsVoteTopic(this);

		return cmsVoteItem;
	}

	public CmsVoteItem removeCmsVoteItem(CmsVoteItem cmsVoteItem) {
		getCmsVoteItems().remove(cmsVoteItem);
		cmsVoteItem.setCmsVoteTopic(null);

		return cmsVoteItem;
	}*/

	/*public List<CmsVoteRecord> getCmsVoteRecords() {
		return this.cmsVoteRecords;
	}

	public void setCmsVoteRecords(List<CmsVoteRecord> cmsVoteRecords) {
		this.cmsVoteRecords = cmsVoteRecords;
	}

	public CmsVoteRecord addCmsVoteRecord(CmsVoteRecord cmsVoteRecord) {
		getCmsVoteRecords().add(cmsVoteRecord);
		cmsVoteRecord.setCmsVoteTopic(this);

		return cmsVoteRecord;
	}

	public CmsVoteRecord removeCmsVoteRecord(CmsVoteRecord cmsVoteRecord) {
		getCmsVoteRecords().remove(cmsVoteRecord);
		cmsVoteRecord.setCmsVoteTopic(null);

		return cmsVoteRecord;
	}*/

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

}