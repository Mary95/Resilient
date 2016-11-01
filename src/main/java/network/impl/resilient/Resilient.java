package network.impl.resilient;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.annotations.UuidGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlRootElement
@Entity
public class Resilient {
	@XmlElement(name="id")
	@UuidGenerator(name="uuid")
    @Id
    @GeneratedValue(generator="uuid")
	private String id;

	@XmlElement(name="createdAt")
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date createdAt;

	@XmlElement(name="pbkey")
	@NotNull
	@Lob
	@JsonSerialize(using=controller.tools.BigIntegerSerializer.class)
	@JsonDeserialize(using=controller.tools.BigIntegerDeserializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private BigInteger pbkey;



	public String getId() {
		return id;
	}

	public void setId(String uuid) {
		 id = uuid;
	}


	public void setCreatedAt(Date date) {
		createdAt = date;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public BigInteger getPbkey() {
		return pbkey;
	}

	public void setPbkey(BigInteger pbkey) {
		this.pbkey = pbkey;
	}


}
