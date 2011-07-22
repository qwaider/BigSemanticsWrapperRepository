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
*  MmdInlineCategoryInCategoriesInWikipediaPageType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/21/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineCategoryInCategoriesInWikipediaPageType extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString name;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL catLink;

	public MmdInlineCategoryInCategoriesInWikipediaPageType()
	{ }

	public MmdInlineCategoryInCategoriesInWikipediaPageType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	name()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.name;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.name = result;
		}
		return result;
	}

	public java.lang.String getName()
	{
		return this.name == null ? null : name().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getNameMetadata()
	{
		return name;
	}

	public void setName(java.lang.String name)
	{
		if (name != null)
			this.name().setValue(name);
	}

	public void setNameMetadata(ecologylab.semantics.metadata.scalar.MetadataString name)
	{
		this.name = name;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	catLink()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.catLink;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.catLink = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getCatLink()
	{
		return this.catLink == null ? null : catLink().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getCatLinkMetadata()
	{
		return catLink;
	}

	public void setCatLink(ecologylab.net.ParsedURL catLink)
	{
		if (catLink != null)
			this.catLink().setValue(catLink);
	}

	public void setCatLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL catLink)
	{
		this.catLink = catLink;
	}
}
