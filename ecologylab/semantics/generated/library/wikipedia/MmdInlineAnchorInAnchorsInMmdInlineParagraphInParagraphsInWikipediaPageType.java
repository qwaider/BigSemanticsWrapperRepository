package ecologylab.semantics.generated.library.wikipedia;

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
*  MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString anchorText;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL link;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString targetTitle;

	public MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType()
	{ }

	public MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	anchorText()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.anchorText;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.anchorText = result;
		}
		return result;
	}

	public java.lang.String getAnchorText()
	{
		return this.anchorText == null ? null : anchorText().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAnchorTextMetadata()
	{
		return anchorText;
	}

	public void setAnchorText(java.lang.String anchorText)
	{
		if (anchorText != null)
			this.anchorText().setValue(anchorText);
	}

	public void setAnchorTextMetadata(ecologylab.semantics.metadata.scalar.MetadataString anchorText)
	{
		this.anchorText = anchorText;
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

	public ecologylab.semantics.metadata.scalar.MetadataString	targetTitle()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.targetTitle;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.targetTitle = result;
		}
		return result;
	}

	public java.lang.String getTargetTitle()
	{
		return this.targetTitle == null ? null : targetTitle().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTargetTitleMetadata()
	{
		return targetTitle;
	}

	public void setTargetTitle(java.lang.String targetTitle)
	{
		if (targetTitle != null)
			this.targetTitle().setValue(targetTitle);
	}

	public void setTargetTitleMetadata(ecologylab.semantics.metadata.scalar.MetadataString targetTitle)
	{
		this.targetTitle = targetTitle;
	}
}
