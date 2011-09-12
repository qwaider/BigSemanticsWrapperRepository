package ecologylab.semantics.generated.library.dlese;

import ecologylab.semantics.generated.library.dlese.AdditionalMetadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.library.dlese.SearchAdditionalMetadataAdn;

/**
*  UserSearchAdditionalMetadata.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class UserSearchAdditionalMetadata extends AdditionalMetadata
{
	/** 
	 */ 
	@simpl_composite	@xml_tag("adn")	@mm_name("search_additional_metadata_adn")
	private SearchAdditionalMetadataAdn searchAdditionalMetadataAdn;

	public UserSearchAdditionalMetadata()
	{ }

	public UserSearchAdditionalMetadata(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public SearchAdditionalMetadataAdn getSearchAdditionalMetadataAdn()
	{
		return searchAdditionalMetadataAdn;
	}

	public void setSearchAdditionalMetadataAdn(SearchAdditionalMetadataAdn searchAdditionalMetadataAdn)
	{
		this.searchAdditionalMetadataAdn = searchAdditionalMetadataAdn;
	}
}
