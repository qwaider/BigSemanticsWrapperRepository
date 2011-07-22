package ecologylab.semantics.generated.library;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.search.SearchResult;

/**
*  GooglePatentImage.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/21/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Google Patents Image Class
 */ 
@simpl_inherit
public class GooglePatentImage extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString inventor;

	/** 
	 */ 
	@simpl_collection("search_result") @mm_name("pic_urls")	private List<SearchResult> picUrls;

	public GooglePatentImage()
	{ }

	public GooglePatentImage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	inventor()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.inventor;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.inventor = result;
		}
		return result;
	}

	public java.lang.String getInventor()
	{
		return this.inventor == null ? null : inventor().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getInventorMetadata()
	{
		return inventor;
	}

	public void setInventor(java.lang.String inventor)
	{
		if (inventor != null)
			this.inventor().setValue(inventor);
	}

	public void setInventorMetadata(ecologylab.semantics.metadata.scalar.MetadataString inventor)
	{
		this.inventor = inventor;
	}

	public List<SearchResult> getPicUrls()
	{
		return picUrls;
	}

	public void setPicUrls(List<SearchResult> picUrls)
	{
		this.picUrls = picUrls;
	}
}
