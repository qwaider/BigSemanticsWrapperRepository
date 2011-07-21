package ecologylab.semantics.generated.library.flickr;

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
*  FlickrTag.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class FlickrTag extends Metadata
{
	/** 
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private MetadataString tagName;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL tagLink;

	public FlickrTag()
	{ }

	public FlickrTag(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	tagName()
	{
		MetadataString	result = this.tagName;
		if (result == null)
		{
			result = new MetadataString();
			this.tagName = result;
		}
		return result;
	}

	public String getTagName()
	{
		return this.tagName().getValue();
	}

	public MetadataString getTagNameMetadata()
	{
		return tagName;
	}

	public void setTagName(String tagName)
	{
		this.tagName().setValue(tagName);
	}

	public void setTagNameMetadata(MetadataString tagName)
	{
		this.tagName = tagName;
	}

	public MetadataParsedURL	tagLink()
	{
		MetadataParsedURL	result = this.tagLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.tagLink = result;
		}
		return result;
	}

	public ParsedURL getTagLink()
	{
		return this.tagLink().getValue();
	}

	public MetadataParsedURL getTagLinkMetadata()
	{
		return tagLink;
	}

	public void setTagLink(ParsedURL tagLink)
	{
		this.tagLink().setValue(tagLink);
	}

	public void setTagLinkMetadata(MetadataParsedURL tagLink)
	{
		this.tagLink = tagLink;
	}
}
