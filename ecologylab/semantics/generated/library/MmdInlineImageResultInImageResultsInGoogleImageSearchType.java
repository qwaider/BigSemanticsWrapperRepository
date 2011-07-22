package ecologylab.semantics.generated.library;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineImageResultInImageResultsInGoogleImageSearchType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineImageResultInImageResultsInGoogleImageSearchType extends Metadata
{
	/** 
	 * image summary
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString summary;

	/** 
	 * raw parsed URL for extracting values 'url', 'referer_url'
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL imgUrl;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString imgSimilarUrl;

	/** 
	 * mime type should be extracted from this property
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString rawProperty;

	/** 
	 * image title
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString imgTitle;

	public MmdInlineImageResultInImageResultsInGoogleImageSearchType()
	{ }

	public MmdInlineImageResultInImageResultsInGoogleImageSearchType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	summary()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.summary;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.summary = result;
		}
		return result;
	}

	public java.lang.String getSummary()
	{
		return this.summary == null ? null : summary().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSummaryMetadata()
	{
		return summary;
	}

	public void setSummary(java.lang.String summary)
	{
		if (summary != null)
			this.summary().setValue(summary);
	}

	public void setSummaryMetadata(ecologylab.semantics.metadata.scalar.MetadataString summary)
	{
		this.summary = summary;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	imgUrl()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.imgUrl;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.imgUrl = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getImgUrl()
	{
		return this.imgUrl == null ? null : imgUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getImgUrlMetadata()
	{
		return imgUrl;
	}

	public void setImgUrl(ecologylab.net.ParsedURL imgUrl)
	{
		if (imgUrl != null)
			this.imgUrl().setValue(imgUrl);
	}

	public void setImgUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL imgUrl)
	{
		this.imgUrl = imgUrl;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	imgSimilarUrl()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.imgSimilarUrl;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.imgSimilarUrl = result;
		}
		return result;
	}

	public java.lang.String getImgSimilarUrl()
	{
		return this.imgSimilarUrl == null ? null : imgSimilarUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getImgSimilarUrlMetadata()
	{
		return imgSimilarUrl;
	}

	public void setImgSimilarUrl(java.lang.String imgSimilarUrl)
	{
		if (imgSimilarUrl != null)
			this.imgSimilarUrl().setValue(imgSimilarUrl);
	}

	public void setImgSimilarUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataString imgSimilarUrl)
	{
		this.imgSimilarUrl = imgSimilarUrl;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	rawProperty()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.rawProperty;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.rawProperty = result;
		}
		return result;
	}

	public java.lang.String getRawProperty()
	{
		return this.rawProperty == null ? null : rawProperty().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getRawPropertyMetadata()
	{
		return rawProperty;
	}

	public void setRawProperty(java.lang.String rawProperty)
	{
		if (rawProperty != null)
			this.rawProperty().setValue(rawProperty);
	}

	public void setRawPropertyMetadata(ecologylab.semantics.metadata.scalar.MetadataString rawProperty)
	{
		this.rawProperty = rawProperty;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	imgTitle()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.imgTitle;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.imgTitle = result;
		}
		return result;
	}

	public java.lang.String getImgTitle()
	{
		return this.imgTitle == null ? null : imgTitle().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getImgTitleMetadata()
	{
		return imgTitle;
	}

	public void setImgTitle(java.lang.String imgTitle)
	{
		if (imgTitle != null)
			this.imgTitle().setValue(imgTitle);
	}

	public void setImgTitleMetadata(ecologylab.semantics.metadata.scalar.MetadataString imgTitle)
	{
		this.imgTitle = imgTitle;
	}
}
