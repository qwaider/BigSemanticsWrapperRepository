package ecologylab.semantics.generated.library;

import java.util.ArrayList;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  MmdInlineParagraphInParagraphsInWikipediaPageType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineParagraphInParagraphsInWikipediaPageType extends Metadata
{
	/** 
	 * Anchors (links) in the paragraph, typically links to another Wikipedia article.
	 */ 
	@simpl_collection("anchor") @mm_name("anchors")	private ArrayList<MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType> anchors;

	/** 
	 */ 
	@simpl_scalar	private MetadataString paragraphText;

	public MmdInlineParagraphInParagraphsInWikipediaPageType()
	{ }

	public MmdInlineParagraphInParagraphsInWikipediaPageType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType> getAnchors()
	{
		return anchors;
	}

	public void setAnchors(ArrayList<MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType> anchors)
	{
		this.anchors = anchors;
	}
	public MetadataString	paragraphText()
	{
		MetadataString	result = this.paragraphText;
		if (result == null)
		{
			result = new MetadataString();
			this.paragraphText = result;
		}
		return result;
	}

	public String getParagraphText()
	{
		return this.paragraphText().getValue();
	}

	public void setParagraphText(String paragraphText)
	{
		this.paragraphText().setValue(paragraphText);
	}

}
