package ecologylab.semantics.generated.library.movie;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.movie.Cast;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Netflix extends CompoundDocument
{
	@simpl_scalar
	private MetadataString mpaaRating;

	@simpl_scalar
	private MetadataInteger runtime;

	@simpl_scalar
	private MetadataInteger theaterRelease;

	@simpl_collection("cast")
	@mm_name("cast")
	private List<Cast> cast;

	public Netflix()
	{ super(); }

	public Netflix(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	mpaaRating()
	{
		MetadataString	result = this.mpaaRating;
		if (result == null)
		{
			result = new MetadataString();
			this.mpaaRating = result;
		}
		return result;
	}

	public String getMpaaRating()
	{
		return this.mpaaRating == null ? null : mpaaRating().getValue();
	}

	public MetadataString getMpaaRatingMetadata()
	{
		return mpaaRating;
	}

	public void setMpaaRating(String mpaaRating)
	{
		if (mpaaRating != null)
			this.mpaaRating().setValue(mpaaRating);
	}

	public void setMpaaRatingMetadata(MetadataString mpaaRating)
	{
		this.mpaaRating = mpaaRating;
	}

	public MetadataInteger	runtime()
	{
		MetadataInteger	result = this.runtime;
		if (result == null)
		{
			result = new MetadataInteger();
			this.runtime = result;
		}
		return result;
	}

	public Integer getRuntime()
	{
		return this.runtime == null ? 0 : runtime().getValue();
	}

	public MetadataInteger getRuntimeMetadata()
	{
		return runtime;
	}

	public void setRuntime(Integer runtime)
	{
		if (runtime != 0)
			this.runtime().setValue(runtime);
	}

	public void setRuntimeMetadata(MetadataInteger runtime)
	{
		this.runtime = runtime;
	}

	public MetadataInteger	theaterRelease()
	{
		MetadataInteger	result = this.theaterRelease;
		if (result == null)
		{
			result = new MetadataInteger();
			this.theaterRelease = result;
		}
		return result;
	}

	public Integer getTheaterRelease()
	{
		return this.theaterRelease == null ? 0 : theaterRelease().getValue();
	}

	public MetadataInteger getTheaterReleaseMetadata()
	{
		return theaterRelease;
	}

	public void setTheaterRelease(Integer theaterRelease)
	{
		if (theaterRelease != 0)
			this.theaterRelease().setValue(theaterRelease);
	}

	public void setTheaterReleaseMetadata(MetadataInteger theaterRelease)
	{
		this.theaterRelease = theaterRelease;
	}

	public List<Cast> getCast()
	{
		return cast;
	}

	public void setCast(List<Cast> cast)
	{
		this.cast = cast;
	}
}
