package ecologylab.bigsemantics.generated.library.fastflip;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.fastflip.Thumbnail;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Fast Flip Search
 */ 
@simpl_inherit
public class FastflipSearch extends CompoundDocument
{
	@simpl_collection("thumbnail")
	@mm_name("thumbnails")
	private List<Thumbnail> thumbnails;

	public FastflipSearch()
	{ super(); }

	public FastflipSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Thumbnail> getThumbnails()
	{
		return thumbnails;
	}

  // lazy evaluation:
  public List<Thumbnail> thumbnails()
  {
    if (thumbnails == null)
      thumbnails = new ArrayList<Thumbnail>();
    return thumbnails;
  }

  // addTo:
  public void addToThumbnails(Thumbnail element)
  {
    thumbnails().add(element);
  }

  // size:
  public int thumbnailsSize()
  {
    return thumbnails == null ? 0 : thumbnails.size();
  }

	public void setThumbnails(List<Thumbnail> thumbnails)
	{
		this.thumbnails = thumbnails;
	}
}
