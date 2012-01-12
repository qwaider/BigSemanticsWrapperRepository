package ecologylab.semantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Tag extends Metadata
{
	@simpl_scalar
	private MetadataString tagName;

	@simpl_scalar
	private MetadataParsedURL link;

	public Tag()
	{ }

	public Tag(MetaMetadataCompositeField mmd) {
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
		return this.tagName == null ? null : tagName().getValue();
	}

	public MetadataString getTagNameMetadata()
	{
		return tagName;
	}

	public void setTagName(String tagName)
	{
		if (tagName != null)
			this.tagName().setValue(tagName);
	}

	public void setTagNameMetadata(MetadataString tagName)
	{
		this.tagName = tagName;
	}

	public MetadataParsedURL	link()
	{
		MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ParsedURL getLink()
	{
		return this.link == null ? null : link().getValue();
	}

	public MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(MetadataParsedURL link)
	{
		this.link = link;
	}
}