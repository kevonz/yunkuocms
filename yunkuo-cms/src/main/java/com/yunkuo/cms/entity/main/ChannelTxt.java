package com.yunkuo.cms.entity.main;

import org.apache.commons.lang.StringUtils;
import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * The persistent class for the cms_channel_txt database table.
 * 
 */
@Entity
@Table(name="cms_channel_txt")
public class ChannelTxt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
/*    @Column(name="channel_id")
    @GenericGenerator(name="foreignKey", strategy="foreign", parameters=@Parameter(name="property", value="channel"))
    @GeneratedValue(generator="foreignKey", strategy=GenerationType.IDENTITY)*/
	private int channelId;

	@Lob
	private String txt;

	@Lob
	private String txt1;

	@Lob
	private String txt2;

	@Lob
	private String txt3;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    //bi-directional one-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private Channel cmsChannel;

	public ChannelTxt() {
	}

	public int getChannelId() {
		return this.channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getTxt() {
		return this.txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String getTxt1() {
		return this.txt1;
	}

	public void setTxt1(String txt1) {
		this.txt1 = txt1;
	}

	public String getTxt2() {
		return this.txt2;
	}

	public void setTxt2(String txt2) {
		this.txt2 = txt2;
	}

	public String getTxt3() {
		return this.txt3;
	}

	public void setTxt3(String txt3) {
		this.txt3 = txt3;
	}

	public Channel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(Channel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}
    public void init() {
        blankToNull();
    }

    public void blankToNull() {
        if (StringUtils.isBlank(getTxt())) {
            setTxt(null);
        }
        if (StringUtils.isBlank(getTxt1())) {
            setTxt1(null);
        }
        if (StringUtils.isBlank(getTxt2())) {
            setTxt2(null);
        }
        if (StringUtils.isBlank(getTxt3())) {
            setTxt3(null);
        }
    }

    /**
     * 是否所有属性都为空
     *
     * @return
     */
    public boolean isAllBlank() {
        return StringUtils.isBlank(getTxt()) && StringUtils.isBlank(getTxt1())
                && StringUtils.isBlank(getTxt2())
                && StringUtils.isBlank(getTxt3());
    }

    public ChannelTxt(int id){
        this.channelId = id;
    }
}