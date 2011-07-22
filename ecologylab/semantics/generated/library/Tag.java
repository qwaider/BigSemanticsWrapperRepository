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
*  Tag.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Tag extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString tagName;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL link;

	public Tag()
	{ }

	public Tag(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	tagName()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.tagName;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.tagName = result;
		}
		return result;
	}

	public java.lang.String getTagName()
	{
		return this.tagName == null ? null : tagName().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTagNameMetadata()
	{
		return tagName;
	}

	public void setTagName(java.lang.String tagName)
	{
		if (tagName != null)
			this.tagName().setValue(tagName);
	}

	public void setTagNameMetadata(ecologylab.semantics.metadata.scalar.MetadataString tagName)
	{
		this.tagName = tagName;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	link()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getLink()
	{
		return this.link == null ? null : link().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ecologylab.net.ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL link)
	{
		this.link = link;
	}
}
