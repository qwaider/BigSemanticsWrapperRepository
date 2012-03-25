package ecologylab.semantics.generated.library.bibManaging;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.search.SearchResult;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class CiteseerxSearchResult extends SearchResult
{
	@simpl_scalar
	private MetadataString citationInfo;

	public CiteseerxSearchResult()
	{ super(); }

	public CiteseerxSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	citationInfo()
	{
		MetadataString	result = this.citationInfo;
		if (result == null)
		{
			result = new MetadataString();
			this.citationInfo = result;
		}
		return result;
	}

	public String getCitationInfo()
	{
		return this.citationInfo == null ? null : citationInfo().getValue();
	}

	public MetadataString getCitationInfoMetadata()
	{
		return citationInfo;
	}

	public void setCitationInfo(String citationInfo)
	{
		if (citationInfo != null)
			this.citationInfo().setValue(citationInfo);
	}

	public void setCitationInfoMetadata(MetadataString citationInfo)
	{
		this.citationInfo = citationInfo;
	}
}
