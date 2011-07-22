package ecologylab.semantics.generated.library.search;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.generated.library.scholarlyPublication.AcmPortalSearchResult;
import ecologylab.semantics.generated.library.bibManaging.CiteseerxSearchResult;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.search.SearchResult;

/**
*  Search.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * 
 */ 
@simpl_inherit
public class Search extends Document
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection	@simpl_classes({CiteseerxSearchResult.class, SearchResult.class, AcmPortalSearchResult.class}) @mm_name("search_results")	private List<SearchResult> searchResults;

	public Search()
	{ }

	public Search(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<SearchResult> getSearchResults()
	{
		return searchResults;
	}

	public void setSearchResults(List<SearchResult> searchResults)
	{
		this.searchResults = searchResults;
	}
}
