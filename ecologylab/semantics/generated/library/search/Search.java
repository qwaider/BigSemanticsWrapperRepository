package ecologylab.semantics.generated.library.search;

import java.util.ArrayList;

import ecologylab.semantics.generated.library.bibManaging.CiteseerxSearchResult;
import ecologylab.semantics.generated.library.scholarlyPublication.AcmPortalSearchResult;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Search.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * 
 */ 
@simpl_inherit
public class Search extends CompoundDocument
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("search_result")	@simpl_classes({AcmPortalSearchResult.class, SearchResult.class, CiteseerxSearchResult.class}) @mm_name("search_results")	private ArrayList<SearchResult> searchResults;

	public Search()
	{ }

	public Search(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<SearchResult> getSearchResults()
	{
		return searchResults;
	}

	public void setSearchResults(ArrayList<SearchResult> searchResults)
	{
		this.searchResults = searchResults;
	}
}
