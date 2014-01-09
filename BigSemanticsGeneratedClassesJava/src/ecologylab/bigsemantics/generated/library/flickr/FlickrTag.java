package ecologylab.bigsemantics.generated.library.flickr;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.flickr.FlickrPhoto;
import ecologylab.bigsemantics.generated.library.flickr.FlickrTag;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *For flickr crawled tags
 */ 
@simpl_inherit
public class FlickrTag extends CompoundDocument
{
	/** 
	 *Collection of all images of a user
	 */ 
	@simpl_collection("flickr_photo")
	@mm_name("photos")
	private List<FlickrPhoto> photos;

	@simpl_composite
	@mm_name("public_tags")
	private FlickrTag publicTags;

	public FlickrTag()
	{ super(); }

	public FlickrTag(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrPhoto> getPhotos()
	{
		return photos;
	}

  // lazy evaluation:
  public List<FlickrPhoto> photos()
  {
    if (photos == null)
      photos = new ArrayList<FlickrPhoto>();
    return photos;
  }

  // addTo:
  public void addToPhotos(FlickrPhoto element)
  {
    photos().add(element);
  }

  // size:
  public int photosSize()
  {
    return photos == null ? 0 : photos.size();
  }

	public void setPhotos(List<FlickrPhoto> photos)
	{
		this.photos = photos;
	}

	public FlickrTag getPublicTags()
	{
		return publicTags;
	}

	public void setPublicTags(FlickrTag publicTags)
	{
		this.publicTags = publicTags;
	}
}
