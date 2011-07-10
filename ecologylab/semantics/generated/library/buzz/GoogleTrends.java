package ecologylab.semantics.generated.library.buzz;

import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  GoogleTrends.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Google trends
 */ 
@simpl_inherit
public class GoogleTrends extends CompoundDocument
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("hot_search") @mm_name("hot_searches")	private ArrayList<MmdInlineHotSearchInHotSearchesInGoogleTrends> hotSearches;

	public GoogleTrends()
	{ }

	public GoogleTrends(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<MmdInlineHotSearchInHotSearchesInGoogleTrends> getHotSearches()
	{
		return hotSearches;
	}

	public void setHotSearches(ArrayList<MmdInlineHotSearchInHotSearchesInGoogleTrends> hotSearches)
	{
		this.hotSearches = hotSearches;
	}
}
