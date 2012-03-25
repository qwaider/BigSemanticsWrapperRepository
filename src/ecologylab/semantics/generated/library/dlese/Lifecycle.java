package ecologylab.semantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.dlese.Contributor;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Lifecycle extends Metadata
{
	@simpl_collection("contributor")
	@mm_name("contributors")
	private List<Contributor> contributors;

	public Lifecycle()
	{ super(); }

	public Lifecycle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Contributor> getContributors()
	{
		return contributors;
	}

	public void setContributors(List<Contributor> contributors)
	{
		this.contributors = contributors;
	}
}
