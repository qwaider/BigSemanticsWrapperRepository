package ecologylab.semantics.generated.library.artwork;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.artwork.MmdInlineTempFieldValueHolderInMomaArtwork;
import ecologylab.semantics.generated.library.artwork.Artwork;

/**
*  MomaArtwork.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MomaArtwork extends Artwork
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString status;

	/** 
	 */ 
	@simpl_composite @mm_name("moma_deparment")	private CompoundDocument momaDeparment;

	/** 
	 */ 
	@simpl_composite @mm_name("moma_classification")	private CompoundDocument momaClassification;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL permalink;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL databaseLink;

	/** 
	 */ 
	@simpl_scalar	private MetadataString momaId;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL imageUrl;

	/** 
	 */ 
	@simpl_composite @mm_name("temp_field_value_holder")	private MmdInlineTempFieldValueHolderInMomaArtwork tempFieldValueHolder;

	public MomaArtwork()
	{ }

	public MomaArtwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	status()
	{
		MetadataString	result = this.status;
		if (result == null)
		{
			result = new MetadataString();
			this.status = result;
		}
		return result;
	}

	public String getStatus()
	{
		return this.status().getValue();
	}

	public MetadataString getStatusMetadata()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status().setValue(status);
	}

	public void setStatusMetadata(MetadataString status)
	{
		this.status = status;
	}

	public CompoundDocument getMomaDeparment()
	{
		return momaDeparment;
	}

	public void setMomaDeparment(CompoundDocument momaDeparment)
	{
		this.momaDeparment = momaDeparment;
	}

	public CompoundDocument getMomaClassification()
	{
		return momaClassification;
	}

	public void setMomaClassification(CompoundDocument momaClassification)
	{
		this.momaClassification = momaClassification;
	}

	public MetadataParsedURL	permalink()
	{
		MetadataParsedURL	result = this.permalink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.permalink = result;
		}
		return result;
	}

	public ParsedURL getPermalink()
	{
		return this.permalink().getValue();
	}

	public MetadataParsedURL getPermalinkMetadata()
	{
		return permalink;
	}

	public void setPermalink(ParsedURL permalink)
	{
		this.permalink().setValue(permalink);
	}

	public void setPermalinkMetadata(MetadataParsedURL permalink)
	{
		this.permalink = permalink;
	}

	public MetadataParsedURL	databaseLink()
	{
		MetadataParsedURL	result = this.databaseLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.databaseLink = result;
		}
		return result;
	}

	public ParsedURL getDatabaseLink()
	{
		return this.databaseLink().getValue();
	}

	public MetadataParsedURL getDatabaseLinkMetadata()
	{
		return databaseLink;
	}

	public void setDatabaseLink(ParsedURL databaseLink)
	{
		this.databaseLink().setValue(databaseLink);
	}

	public void setDatabaseLinkMetadata(MetadataParsedURL databaseLink)
	{
		this.databaseLink = databaseLink;
	}

	public MetadataString	momaId()
	{
		MetadataString	result = this.momaId;
		if (result == null)
		{
			result = new MetadataString();
			this.momaId = result;
		}
		return result;
	}

	public String getMomaId()
	{
		return this.momaId().getValue();
	}

	public MetadataString getMomaIdMetadata()
	{
		return momaId;
	}

	public void setMomaId(String momaId)
	{
		this.momaId().setValue(momaId);
	}

	public void setMomaIdMetadata(MetadataString momaId)
	{
		this.momaId = momaId;
	}

	public MetadataParsedURL	imageUrl()
	{
		MetadataParsedURL	result = this.imageUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imageUrl = result;
		}
		return result;
	}

	public ParsedURL getImageUrl()
	{
		return this.imageUrl().getValue();
	}

	public MetadataParsedURL getImageUrlMetadata()
	{
		return imageUrl;
	}

	public void setImageUrl(ParsedURL imageUrl)
	{
		this.imageUrl().setValue(imageUrl);
	}

	public void setImageUrlMetadata(MetadataParsedURL imageUrl)
	{
		this.imageUrl = imageUrl;
	}

	public MmdInlineTempFieldValueHolderInMomaArtwork getTempFieldValueHolder()
	{
		return tempFieldValueHolder;
	}

	public void setTempFieldValueHolder(MmdInlineTempFieldValueHolderInMomaArtwork tempFieldValueHolder)
	{
		this.tempFieldValueHolder = tempFieldValueHolder;
	}
}
