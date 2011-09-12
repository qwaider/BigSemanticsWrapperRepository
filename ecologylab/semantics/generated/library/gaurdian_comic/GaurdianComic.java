package ecologylab.semantics.generated.library.gaurdian_comic;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;

/**
*  GaurdianComic.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * This MMD was initially generated by the browser authoring tool
 */ 
@simpl_inherit
public class GaurdianComic extends Document
{
	/** 
	 * Explanation of the comic
	 */ 
	@simpl_scalar	
	private MetadataString comicSubtext;

	/** 
	 * Contributor of the comic
	 */ 
	@simpl_scalar	
	private MetadataString artist;

	/** 
	 * MyComment
	 */ 
	@simpl_scalar	
	private MetadataString datePublished;

	public GaurdianComic()
	{ }

	public GaurdianComic(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	comicSubtext()
	{
		MetadataString	result = this.comicSubtext;
		if (result == null)
		{
			result = new MetadataString();
			this.comicSubtext = result;
		}
		return result;
	}

	public String getComicSubtext()
	{
		return this.comicSubtext == null ? null : comicSubtext().getValue();
	}

	public MetadataString getComicSubtextMetadata()
	{
		return comicSubtext;
	}

	public void setComicSubtext(String comicSubtext)
	{
		if (comicSubtext != null)
			this.comicSubtext().setValue(comicSubtext);
	}

	public void setComicSubtextMetadata(MetadataString comicSubtext)
	{
		this.comicSubtext = comicSubtext;
	}

	public MetadataString	artist()
	{
		MetadataString	result = this.artist;
		if (result == null)
		{
			result = new MetadataString();
			this.artist = result;
		}
		return result;
	}

	public String getArtist()
	{
		return this.artist == null ? null : artist().getValue();
	}

	public MetadataString getArtistMetadata()
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		if (artist != null)
			this.artist().setValue(artist);
	}

	public void setArtistMetadata(MetadataString artist)
	{
		this.artist = artist;
	}

	public MetadataString	datePublished()
	{
		MetadataString	result = this.datePublished;
		if (result == null)
		{
			result = new MetadataString();
			this.datePublished = result;
		}
		return result;
	}

	public String getDatePublished()
	{
		return this.datePublished == null ? null : datePublished().getValue();
	}

	public MetadataString getDatePublishedMetadata()
	{
		return datePublished;
	}

	public void setDatePublished(String datePublished)
	{
		if (datePublished != null)
			this.datePublished().setValue(datePublished);
	}

	public void setDatePublishedMetadata(MetadataString datePublished)
	{
		this.datePublished = datePublished;
	}
}
