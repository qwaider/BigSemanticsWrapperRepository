package ecologylab.semantics.generated.library.fastflip;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.fastflip.Thumbnail;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  FastflipSearch.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Fast Flip Search
 */ 
@simpl_inherit
public class FastflipSearch extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("thumbnail") @mm_name("thumbnails")	private List<Thumbnail> thumbnails;

	public FastflipSearch()
	{ }

	public FastflipSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Thumbnail> getThumbnails()
	{
		return thumbnails;
	}

	public void setThumbnails(List<Thumbnail> thumbnails)
	{
		this.thumbnails = thumbnails;
	}
}
