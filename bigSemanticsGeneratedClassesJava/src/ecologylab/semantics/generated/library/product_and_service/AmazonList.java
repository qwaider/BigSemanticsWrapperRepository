package ecologylab.semantics.generated.library.product_and_service;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.creative_work.CreativeWork;
import ecologylab.semantics.generated.library.product_and_service.AmazonProduct;
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
public class AmazonList extends CreativeWork
{
	@simpl_collection("amazon_product")
	@mm_name("items")
	private List<AmazonProduct> items;

	public AmazonList()
	{ super(); }

	public AmazonList(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<AmazonProduct> getItems()
	{
		return items;
	}

  // lazy evaluation:
  public List<AmazonProduct> items()
  {
    if (items == null)
      items = new ArrayList<AmazonProduct>();
    return items;
  }

  // addTo:
  public void addToItems(AmazonProduct element)
  {
    items().add(element);
  }

  // size:
  public int itemsSize()
  {
    return items == null ? 0 : items.size();
  }

	public void setItems(List<AmazonProduct> items)
	{
		this.items = items;
	}
}
