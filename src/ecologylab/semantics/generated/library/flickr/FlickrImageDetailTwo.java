package ecologylab.semantics.generated.library.flickr;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.flickr.AuthorPhotos;
import ecologylab.semantics.generated.library.flickr.FlickrTag;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *A Flickr Image result page
 */ 
@simpl_inherit
public class FlickrImageDetailTwo extends CompoundDocument
{
	@simpl_scalar
	private MetadataParsedURL imageLocation;

	@simpl_scalar
	private MetadataString views;

	@simpl_scalar
	private MetadataString place;

	@simpl_scalar
	private MetadataParsedURL placeLink;

	@simpl_collection("flickr_tag")
	@mm_name("flickr_tags")
	private List<FlickrTag> flickrTags;

	@simpl_composite
	@mm_name("author_photos")
	private AuthorPhotos authorPhotos;

	public FlickrImageDetailTwo()
	{ }

	public FlickrImageDetailTwo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	imageLocation()
	{
		MetadataParsedURL	result = this.imageLocation;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imageLocation = result;
		}
		return result;
	}

	public ParsedURL getImageLocation()
	{
		return this.imageLocation == null ? null : imageLocation().getValue();
	}

	public MetadataParsedURL getImageLocationMetadata()
	{
		return imageLocation;
	}

	public void setImageLocation(ParsedURL imageLocation)
	{
		if (imageLocation != null)
			this.imageLocation().setValue(imageLocation);
	}

	public void setImageLocationMetadata(MetadataParsedURL imageLocation)
	{
		this.imageLocation = imageLocation;
	}

	public MetadataString	views()
	{
		MetadataString	result = this.views;
		if (result == null)
		{
			result = new MetadataString();
			this.views = result;
		}
		return result;
	}

	public String getViews()
	{
		return this.views == null ? null : views().getValue();
	}

	public MetadataString getViewsMetadata()
	{
		return views;
	}

	public void setViews(String views)
	{
		if (views != null)
			this.views().setValue(views);
	}

	public void setViewsMetadata(MetadataString views)
	{
		this.views = views;
	}

	public MetadataString	place()
	{
		MetadataString	result = this.place;
		if (result == null)
		{
			result = new MetadataString();
			this.place = result;
		}
		return result;
	}

	public String getPlace()
	{
		return this.place == null ? null : place().getValue();
	}

	public MetadataString getPlaceMetadata()
	{
		return place;
	}

	public void setPlace(String place)
	{
		if (place != null)
			this.place().setValue(place);
	}

	public void setPlaceMetadata(MetadataString place)
	{
		this.place = place;
	}

	public MetadataParsedURL	placeLink()
	{
		MetadataParsedURL	result = this.placeLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.placeLink = result;
		}
		return result;
	}

	public ParsedURL getPlaceLink()
	{
		return this.placeLink == null ? null : placeLink().getValue();
	}

	public MetadataParsedURL getPlaceLinkMetadata()
	{
		return placeLink;
	}

	public void setPlaceLink(ParsedURL placeLink)
	{
		if (placeLink != null)
			this.placeLink().setValue(placeLink);
	}

	public void setPlaceLinkMetadata(MetadataParsedURL placeLink)
	{
		this.placeLink = placeLink;
	}

	public List<FlickrTag> getFlickrTags()
	{
		return flickrTags;
	}

	public void setFlickrTags(List<FlickrTag> flickrTags)
	{
		this.flickrTags = flickrTags;
	}

	public AuthorPhotos getAuthorPhotos()
	{
		return authorPhotos;
	}

	public void setAuthorPhotos(AuthorPhotos authorPhotos)
	{
		this.authorPhotos = authorPhotos;
	}
}