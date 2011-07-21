package ecologylab.semantics.generated.library.artwork;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.artwork.Artist;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Artwork.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Artwork class
 */ 
@simpl_inherit
public class Artwork extends CompoundDocument
{
	/** 
	 * Set of artists.
	 */ 
	@simpl_collection("artist") @mm_name("artists")	private List<Artist> artists;

	/** 
	 * Medium on which the work is done.
	 */ 
	@simpl_scalar	private MetadataString medium;

	/** 
	 * Abstract of the work.
	 */ 
	@simpl_scalar	@xml_tag("abstract")	private MetadataString abstractField;

	/** 
	 * Year the work was created.
	 */ 
	@simpl_scalar	private MetadataString year;

	/** 
	 */ 
	@simpl_scalar	private MetadataString dimensions;

	public Artwork()
	{ }

	public Artwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Artist> getArtists()
	{
		return artists;
	}

	public void setArtists(List<Artist> artists)
	{
		this.artists = artists;
	}

	public MetadataString	medium()
	{
		MetadataString	result = this.medium;
		if (result == null)
		{
			result = new MetadataString();
			this.medium = result;
		}
		return result;
	}

	public String getMedium()
	{
		return this.medium().getValue();
	}

	public MetadataString getMediumMetadata()
	{
		return medium;
	}

	public void setMedium(String medium)
	{
		this.medium().setValue(medium);
	}

	public void setMediumMetadata(MetadataString medium)
	{
		this.medium = medium;
	}

	public MetadataString	abstractField()
	{
		MetadataString	result = this.abstractField;
		if (result == null)
		{
			result = new MetadataString();
			this.abstractField = result;
		}
		return result;
	}

	public String getAbstractField()
	{
		return this.abstractField().getValue();
	}

	public MetadataString getAbstractFieldMetadata()
	{
		return abstractField;
	}

	public void setAbstractField(String abstractField)
	{
		this.abstractField().setValue(abstractField);
	}

	public void setAbstractFieldMetadata(MetadataString abstractField)
	{
		this.abstractField = abstractField;
	}

	public MetadataString	year()
	{
		MetadataString	result = this.year;
		if (result == null)
		{
			result = new MetadataString();
			this.year = result;
		}
		return result;
	}

	public String getYear()
	{
		return this.year().getValue();
	}

	public MetadataString getYearMetadata()
	{
		return year;
	}

	public void setYear(String year)
	{
		this.year().setValue(year);
	}

	public void setYearMetadata(MetadataString year)
	{
		this.year = year;
	}

	public MetadataString	dimensions()
	{
		MetadataString	result = this.dimensions;
		if (result == null)
		{
			result = new MetadataString();
			this.dimensions = result;
		}
		return result;
	}

	public String getDimensions()
	{
		return this.dimensions().getValue();
	}

	public MetadataString getDimensionsMetadata()
	{
		return dimensions;
	}

	public void setDimensions(String dimensions)
	{
		this.dimensions().setValue(dimensions);
	}

	public void setDimensionsMetadata(MetadataString dimensions)
	{
		this.dimensions = dimensions;
	}
}
