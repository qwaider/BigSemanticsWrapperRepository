package ecologylab.semantics.generated.library.search;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  YahooResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class YahooResult extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("Summary")	private MetadataString summary;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("RefererUrl")	private MetadataParsedURL refererUrl;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("ModificationDate")	private MetadataString modificationDate;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("MimeType")	private MetadataString mimeType;

	/** 
	 */ 
	@simpl_composite	@xml_tag("Thumbnail") @mm_name("thumbnail")	private YahooThumbnail thumbnail;

	public YahooResult()
	{ }

	public YahooResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	summary()
	{
		MetadataString	result = this.summary;
		if (result == null)
		{
			result = new MetadataString();
			this.summary = result;
		}
		return result;
	}

	public String getSummary()
	{
		return this.summary().getValue();
	}

	public void setSummary(String summary)
	{
		this.summary().setValue(summary);
	}

	public MetadataParsedURL	refererUrl()
	{
		MetadataParsedURL	result = this.refererUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.refererUrl = result;
		}
		return result;
	}

	public ParsedURL getRefererUrl()
	{
		return this.refererUrl().getValue();
	}

	public void setRefererUrl(ParsedURL refererUrl)
	{
		this.refererUrl().setValue(refererUrl);
	}

	public MetadataString	modificationDate()
	{
		MetadataString	result = this.modificationDate;
		if (result == null)
		{
			result = new MetadataString();
			this.modificationDate = result;
		}
		return result;
	}

	public String getModificationDate()
	{
		return this.modificationDate().getValue();
	}

	public void setModificationDate(String modificationDate)
	{
		this.modificationDate().setValue(modificationDate);
	}

	public MetadataString	mimeType()
	{
		MetadataString	result = this.mimeType;
		if (result == null)
		{
			result = new MetadataString();
			this.mimeType = result;
		}
		return result;
	}

	public String getMimeType()
	{
		return this.mimeType().getValue();
	}

	public void setMimeType(String mimeType)
	{
		this.mimeType().setValue(mimeType);
	}


	public YahooThumbnail getThumbnail()
	{
		return thumbnail;
	}

	public void setThumbnail(YahooThumbnail thumbnail)
	{
		this.thumbnail = thumbnail;
	}
}
