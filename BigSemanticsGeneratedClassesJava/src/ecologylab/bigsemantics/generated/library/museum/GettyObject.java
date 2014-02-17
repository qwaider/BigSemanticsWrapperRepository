package ecologylab.bigsemantics.generated.library.museum;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.artwork.Artwork;
import ecologylab.bigsemantics.generated.library.museum.GettyArtist;
import ecologylab.bigsemantics.generated.library.museum.GettyWorkInfo;
import ecologylab.bigsemantics.metadata.builtins.Image;
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

@simpl_inherit
public class GettyObject extends Artwork
{
	@simpl_collection("getty_artist")
	@mm_name("artist")
	private List<GettyArtist> artist;

	@simpl_composite
	@mm_name("image")
	private Image image;

	@simpl_composite
	@mm_name("work_info")
	private GettyWorkInfo workInfo;

	public GettyObject()
	{ super(); }

	public GettyObject(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<GettyArtist> getArtist()
	{
		return artist;
	}

  // lazy evaluation:
  public List<GettyArtist> artist()
  {
    if (artist == null)
      artist = new ArrayList<GettyArtist>();
    return artist;
  }

  // addTo:
  public void addToArtist(GettyArtist element)
  {
    artist().add(element);
  }

  // size:
  public int artistSize()
  {
    return artist == null ? 0 : artist.size();
  }

	public void setArtist(List<GettyArtist> artist)
	{
		this.artist = artist;
	}

	public Image getImage()
	{
		return image;
	}

	public void setImage(Image image)
	{
		this.image = image;
	}

	public GettyWorkInfo getWorkInfo()
	{
		return workInfo;
	}

	public void setWorkInfo(GettyWorkInfo workInfo)
	{
		this.workInfo = workInfo;
	}
}
