package ecologylab.bigsemantics.generated.library.artwork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class TempFieldValueHolder extends Metadata
{
	@simpl_scalar
	private MetadataString tempDimensions;

	@simpl_scalar
	private MetadataString tempYear;

	@simpl_scalar
	private MetadataString tempMedium;

	public TempFieldValueHolder()
	{ super(); }

	public TempFieldValueHolder(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	tempDimensions()
	{
		MetadataString	result = this.tempDimensions;
		if (result == null)
		{
			result = new MetadataString();
			this.tempDimensions = result;
		}
		return result;
	}

	public String getTempDimensions()
	{
		return this.tempDimensions == null ? null : tempDimensions().getValue();
	}

	public MetadataString getTempDimensionsMetadata()
	{
		return tempDimensions;
	}

	public void setTempDimensions(String tempDimensions)
	{
		if (tempDimensions != null)
			this.tempDimensions().setValue(tempDimensions);
	}

	public void setTempDimensionsMetadata(MetadataString tempDimensions)
	{
		this.tempDimensions = tempDimensions;
	}

	public MetadataString	tempYear()
	{
		MetadataString	result = this.tempYear;
		if (result == null)
		{
			result = new MetadataString();
			this.tempYear = result;
		}
		return result;
	}

	public String getTempYear()
	{
		return this.tempYear == null ? null : tempYear().getValue();
	}

	public MetadataString getTempYearMetadata()
	{
		return tempYear;
	}

	public void setTempYear(String tempYear)
	{
		if (tempYear != null)
			this.tempYear().setValue(tempYear);
	}

	public void setTempYearMetadata(MetadataString tempYear)
	{
		this.tempYear = tempYear;
	}

	public MetadataString	tempMedium()
	{
		MetadataString	result = this.tempMedium;
		if (result == null)
		{
			result = new MetadataString();
			this.tempMedium = result;
		}
		return result;
	}

	public String getTempMedium()
	{
		return this.tempMedium == null ? null : tempMedium().getValue();
	}

	public MetadataString getTempMediumMetadata()
	{
		return tempMedium;
	}

	public void setTempMedium(String tempMedium)
	{
		if (tempMedium != null)
			this.tempMedium().setValue(tempMedium);
	}

	public void setTempMediumMetadata(MetadataString tempMedium)
	{
		this.tempMedium = tempMedium;
	}
}
