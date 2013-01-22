package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_scope;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Search<SR extends Document> extends Document
{
	@simpl_scalar
	private MetadataString query;

	@simpl_collection
	@simpl_nowrap
	@simpl_scope("repository_documents")
	@mm_name("search_results")
	private List<SR> searchResults;

	public Search()
	{ super(); }

	public Search(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	query()
	{
		MetadataString	result = this.query;
		if (result == null)
		{
			result = new MetadataString();
			this.query = result;
		}
		return result;
	}

	public String getQuery()
	{
		return this.query == null ? null : query().getValue();
	}

	public MetadataString getQueryMetadata()
	{
		return query;
	}

	public void setQuery(String query)
	{
		if (query != null)
			this.query().setValue(query);
	}

	public void setQueryMetadata(MetadataString query)
	{
		this.query = query;
	}

	public List<SR> getSearchResults()
	{
		return searchResults;
	}

  // lazy evaluation:
  public List<SR> searchResults()
  {
    if (searchResults == null)
      searchResults = new ArrayList<SR>();
    return searchResults;
  }

  // addTo:
  public void addToSearchResults(SR element)
  {
    searchResults().add(element);
  }

  // size:
  public int searchResultsSize()
  {
    return searchResults == null ? 0 : searchResults.size();
  }

	public void setSearchResults(List<SR> searchResults)
	{
		this.searchResults = searchResults;
	}
}
