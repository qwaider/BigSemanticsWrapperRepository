package ecologylab.semantics.generated.library.flickr;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.library.flickr.FlickrLink;

/**
*  FlickrTags.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * For flickr crawled tags
 */ 
@simpl_inherit
public class FlickrTags extends CompoundDocument
{
	/** 
	 * Collection of all images of a user
	 */ 
	@simpl_collection("flickr_link")	@mm_name("flickr_link_set")
	private List<FlickrLink> flickrLinkSet;

	public FlickrTags()
	{ }

	public FlickrTags(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrLink> getFlickrLinkSet()
	{
		return flickrLinkSet;
	}

	public void setFlickrLinkSet(List<FlickrLink> flickrLinkSet)
	{
		this.flickrLinkSet = flickrLinkSet;
	}
}
