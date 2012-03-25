package ecologylab.semantics.generated.library.products;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.creativeWork.CreativeWork;
import ecologylab.semantics.generated.library.products.AmazonProduct;
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
public class AmazonListMania extends CreativeWork
{
	@simpl_collection("amazon_product")
	@mm_name("items")
	private List<AmazonProduct> items;

	public AmazonListMania()
	{ super(); }

	public AmazonListMania(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<AmazonProduct> getItems()
	{
		return items;
	}

	public void setItems(List<AmazonProduct> items)
	{
		this.items = items;
	}
}
