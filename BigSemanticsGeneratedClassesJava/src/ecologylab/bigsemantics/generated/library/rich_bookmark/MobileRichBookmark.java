package ecologylab.bigsemantics.generated.library.rich_bookmark;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.gis.GisLocation;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.builtins.Clipping;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataDate;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_scope;
import java.util.Date;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class MobileRichBookmark extends Metadata
{
	@simpl_composite
	@simpl_scope("repository_clippings")
	@mm_name("clipping")
	private Clipping clipping;

	@simpl_scalar
	private MetadataDate time;

	@simpl_composite
	@mm_name("gis_location")
	private GisLocation gisLocation;

	public MobileRichBookmark()
	{ super(); }

	public MobileRichBookmark(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Clipping getClipping()
	{
		return clipping;
	}

	public void setClipping(Clipping clipping)
	{
		this.clipping = clipping;
	}

	public MetadataDate	time()
	{
		MetadataDate	result = this.time;
		if (result == null)
		{
			result = new MetadataDate();
			this.time = result;
		}
		return result;
	}

	public Date getTime()
	{
		return this.time == null ? null : time().getValue();
	}

	public MetadataDate getTimeMetadata()
	{
		return time;
	}

	public void setTime(Date time)
	{
		if (time != null)
			this.time().setValue(time);
	}

	public void setTimeMetadata(MetadataDate time)
	{
		this.time = time;
	}

	public GisLocation getGisLocation()
	{
		return gisLocation;
	}

	public void setGisLocation(GisLocation gisLocation)
	{
		this.gisLocation = gisLocation;
	}
}