package nl.avisi.structurizr.site.generatr.site.context

import com.structurizr.model.SoftwareSystem
import nl.avisi.structurizr.site.generatr.normalizedName

class SoftwareSystemDeploymentPageContext(
    generatorContext: GeneratorContext,
    override val softwareSystem: SoftwareSystem
) :
    AbstractSoftwareSystemPageContext(
        generatorContext,
        softwareSystem.name,
        "${softwareSystem.normalizedName}/deployment/index.html"
    )
